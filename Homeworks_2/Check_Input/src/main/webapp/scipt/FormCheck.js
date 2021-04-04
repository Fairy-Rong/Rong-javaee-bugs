function checkForm(form){
    var amount = form["amount"].value;
    var body = form["body"].value;
    var sizes = form['sizes'];

    pattern = /^[0-9]+$/
    if(amount==null || amount=="" || !pattern.test(amount)){
        alert("wrong amount");
        return false;
    }

    if(body == "Select Beer Body"){
        alert("wrong body");
        return false;
    }

    has_checked_size=false;
    for(i=0;i<sizes.length;i++){
        if(sizes[i].checked){
            has_checked_size=true;
        }
    }

    if(!has_checked_size){
        alert("wrong sizes")
        return false;
    }

    return true;
}

function checkForm_1(){
    return checkForm(document.form1)
}

function checkForm_2(){
    return checkForm(document.form2)
}