

const ws = new WebSocket("ws://localhost:8080/chat");

ws.onmessage = function(event) {
    const msg = JSON.parse(event.data);
    document.getElementById("chat").innerHTML +=
        `<p><b>${msg.de}:</b> ${msg.texto}</p>`;
};

function enviar() {
    const nome = document.getElementById("nome").value;
    const texto = document.getElementById("mensagem").value;

    const mensagem = {
        de: nome,
        texto: texto
    };

    ws.send(JSON.stringify(mensagem));
    document.getElementById("mensagem").value = "";


