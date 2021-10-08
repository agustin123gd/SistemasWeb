var btnRegistrar = document.getElementById("btnRegistrar");
btnRegistrar.addEventListener("click", function () {
    var params = new URLSearchParams();
    var email = document.getElementById("exampleInputEmail1").value;
    var pass = document.getElementById("exampleInputPassword1").value;
    var cont = document.getElementById("cont");
    console.log("hola");
    params.append("nombre", email);
    params.append("pass", pass);
    axios.get("http://localhost:4567/add?"+params)
        .then(function (rs) {
            cont.innerHTML=rs.data;
            console.log(rs.data);
        })
        .catch(function (error) {
            console.log(error);
        });
});
