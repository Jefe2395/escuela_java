class Calculadora
{
    constructor()
    {
        this.result = document.getElementById("resultado");
    }

    numeroPulsado(eventObj) {
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
            this.result.value += valor;
    }
}
;
let calculadora = null;
window.onload = function ()
{
    let botones = document.getElementsByClassName("num"); //Array de botones
    calculadora = new Calculadora();
    for (let boton of botones)
    {
        boton.addEventListener("click", (evtObj) => 
        {
            calculadora.numeroPulsado(evtObj)
        });
    }
};



