package com.example.Rongrongzizuo;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

@WebServlet(value ="/RongServlet")
public class RongServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload =new ServletFileUpload(factory);
        try {
            List<FileItem> items = upload.parseRequest(req);
            FileItem image = items.get(0);
            String path =getServletContext().getRealPath("upload")+"/"+image.getName();
            File file = new File(path);

            if (!file.getParentFile().exists()){
                file.getParentFile().mkdir();
            }
            if(!file.exists()){
                image.write(file);
            }
            BufferedImage pig = ImageIO.read(file);
            ImageIO.write(pig,"jpg",resp.getOutputStream());

        } catch (FileUploadException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
