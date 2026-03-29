/* fetch
const url = 'https://dog.ceo/api/breeds/image/random -'
fetch(url)
    .then(respossta => respossta.json())
    .then(dados => console.log(dados))
*/


const url = 'https://bible-api.com/john 3:16'
fetch(url)
    .then(respossta => respossta.json())
    .then(dados => dados.verses[0])
    .then(versiculo => versiculo.text)
    .then(console.log)