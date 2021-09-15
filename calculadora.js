 var num=0, num2=0;
 var op;
function numeros(valor) {
    document.getElementById("num").value += valor;
    console.log()
}

function operacion(valor) {   
    op = valor;
    num = document.getElementById("num").value;
    console.log(num +" "+op);
    document.getElementById("num").value="";
}

function igual() {
    num2 = document.getElementById("num").value;
    console.log(num);
    switch(op){
        case "+":
            num =parseInt(num) + parseInt(num2);
            break;
        case "-":
            num =parseInt(num) - parseInt(num2);
            break;
        case "*":
            num = parseInt(num) * parseInt(num2);
            break;
        case "/":
            num = parseInt(num) / parseInt(num2);
            break;
                                  
    }
    document.getElementById("num").value=num;
}

function limpiar() {   
    document.getElementById("num").value="";
}