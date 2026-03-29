// Função passada como parâmetro para outra função e essa função irá ser chamada de volta em algum momento.

setTimeout(function ola() {
    console.log('oi')
}, 2000);

/* setInterval(() => {
    console.log('fasfa')
}, 3000); */