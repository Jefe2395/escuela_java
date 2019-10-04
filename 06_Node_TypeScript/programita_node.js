console.log("Hola que hay");
var directorio = process.cwd
console.log("directorio: " + directorio);
console.log("Dso CPU: " + process.cpuUsage());
console.log("Dso User: " + process.cpuUsage().user);

document.getElementById("No-Es-Navegador");