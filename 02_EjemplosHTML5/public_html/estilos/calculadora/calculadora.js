class Calculadora
{
    constructor()
    {
        this.result = document.getElementById("resultado");
        this.anterior = document.getElementById("anterior")
        this.men = 0;
        this.operador = "";
        this.nuevoNum = false;
    }

    numeroPulsado(eventObj) {
        if (this.nuevoNum)
        {
            this.result.value = "0";
            this.nuevoNum = false;
        }
        let valor = eventObj.currentTarget.innerHTML;
        //alert("Pulsado " + valor);
        if (valor === "+/-")
            this.result.value = "" + (-(parseFloat(this.result.value)));
        else if (valor === ".")
        {
            if (!this.result.value.includes("."))
            {
                this.result.value += valor;
            }
        } else
        {
            this.result.value += valor;
            this.result.value = parseFloat(this.result.value);
        }
    }
    operadorPulsado(evObj)
    {
        let operadorActual = evObj.currentTarget.innerHTML;

        if (this.operador !== "" || operadorActual === "=")
        {
            this.calcular();
        }

        this.men = parseFloat(this.result.value);
        //Subir a caja de texto valor anterior y operador

        if (this.operador !== "=" && operadorActual !== "=")
        {
            this.anterior.value = `${this.men} ${this.operador}`;
            this.result.value = "0";
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
            let valActual = parseFloat(this.result.value);
            let resultado = eval(this.men.toString() + this.operador + valActual);
            this.result.value = resultado;
        }

    }
}
;
let calculadora = null;
window.onload = function ()
{
    let botones = document.getElementsByClassName("num"); //Array de botones
    let botonesOp = document.getElementsByClassName("oper");
    calculadora = new Calculadora();
    for (let boton of botones)
    {
        boton.addEventListener("click", (evtObj) =>
        {
            calculadora.numeroPulsado(evtObj)
        });
    }
    for (let botOp of botonesOp)
    {
        botOp.addEventListener("click", (evObj) =>
        {
            calculadora.operadorPulsado(evObj);
        });
    }
};



