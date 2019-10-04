var Animal = /** @class */ (function () {
    function Animal(especie, edad, volador) {
        this.especie = especie;
        this.edad = edad;
        this.volador = volador;
    }
    Animal.prototype.stringfy = function () {
        return "Animal " + this.especie + " con" + this.edad;
    };
    Animal.prototype.mostrar = function () {
        console.log(this.stringfy());
    };
    return Animal;
}());
var perro = new Animal("Perro", 7, false);
perro.mostrar();
