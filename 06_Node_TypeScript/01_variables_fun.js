//Ultimo codigo JS
var hola = "hola";
console.log("Guay " + hola);
function otroHola(saludo) {
    console.log("saludo " + saludo);
}
otroHola(hola);
otroHola(" Adios JS");
// Type Script:
var variableNum;
//console.log(variableNoDeclarada);
variableNum = 100;
//variableNum = "Hola"; Mal en tipos
console.log(variableNum);
var miUnion;
// miUnion = new Object();
miUnion = true;
miUnion = "...";
;
var miCumple = { dia: 23, mes: 4, anio: 1999 };
console.log("Cumple el " + miCumple.dia + " del " + miCumple.mes);
// any: un tipo que dice que puede ser de culaquier tipo.
function concatenar(texto1, texto2) {
    console.log("Concatenado " + texto1 + texto2);
}
concatenar("Total, ", "que recibe una cosa");
concatenar("u otra, ", miCumple);
