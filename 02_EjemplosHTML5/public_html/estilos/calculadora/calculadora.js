class Calculadora
{
    constructor()
    {
        //this.result = document.getElementById("resultado");
        this.result = $("#resultado");
        this.anterior = $("#anterior");
        this.men = 0;
        this.operador = "";
        this.nuevoNum = false;
    }

    numeroPulsado(eventObj) {
        if (this.nuevoNum)
        {
            this.result.val("0");
            this.nuevoNum = false;
        }
        let valor = eventObj.currentTarget.innerHTML;
        //alert("Pulsado " + valor);
        if (valor === "+/-")
            this.result.val("" + (-(parseFloat(this.result.val()))));
        else if (valor === ".")
        {
            if (!this.result.val().includes("."))
            {
                this.result.val(this.result.val() + valor);
            }
        } else
        {
            this.result.val(this.result.val() + valor);
            this.result.val(parseFloat(this.result.val()));
        }
    }
    operadorPulsado(evObj)
    {
        let operadorActual = evObj.currentTarget.innerHTML;

        if (this.operador !== "" || operadorActual === "=")
        {
            this.calcular();
        }

        this.men = parseFloat(this.result.val());
        //Subir a caja de texto valor anterior y operador

        if (this.operador !== "=" && operadorActual !== "=")
        {
            this.anterior.val(`${this.men} ${this.operador}`);
            this.result.val("0");
            this.operador = operadorActual;
        } else
        {
            this.operador = "";

        }

        this.nuevoNum = true;
    }
    calcular()
    {
        if (this.operador !== "=")
        {
            let valActual = parseFloat(this.result.val());
            let resultado = eval(this.men.toString() + this.operador + valActual);
            this.result.val(resultado);
            $("#anterior").css("background-color", "green");
        }

    }
}
;
let calculadora = null;


let inicializacion = function ()
{
    calculadora = new Calculadora();
    //Con JQuery
    $(".num").click((evtObj) =>
    {
        calculadora.numeroPulsado(evtObj);
        var colorR = Math.floor((Math.random() * 256));
        var colorG = Math.floor((Math.random() * 256));
        var colorB = Math.floor((Math.random() * 256));
        $(".num").css("background-color", "rgb(" + colorR + "," + colorG + "," + colorB + ")");
    });
    $(".oper").click((evObj) =>
    {
        calculadora.operadorPulsado(evObj);
    })
    //Javascript
    //let botones = document.getElementsByClassName("num"); //Array de botones
    //for (let boton of botones)
    //{
    //boton.addEventListener("click", (evtObj) =>
    //{
    //  calculadora.numeroPulsado(evtObj);
    //});
    //}
    //$(".num")
//    let botonesOp = document.getElementsByClassName("oper");
//    for (let botOp of botonesOp)
//    {
//        botOp.addEventListener("click", (evObj) =>
//        {
//            calculadora.operadorPulsado(evObj);
//        });
//    }
};
$(document).ready(inicializacion);



