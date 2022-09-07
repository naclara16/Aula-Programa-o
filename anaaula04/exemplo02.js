// ---------- HORA DO DIA
let hora = 19

if ( hora < 6) {
    console.log("boa madrugada!")
} if(hora < 12) {
    console.log("bom dia!")
} if(hora<18){
    console.log("boa tarde")
} else {
    console.log("boa noite")
}

console.log()
console.log("===================")
console.log()

//---------------- ENTRADA NA BALADA

let idade = 50

if (idade >= 60){
    console.log("pode entrar,so n morre")
} else if(idade >= 18){
    console.log("pode entrar!")
} else { 
    console.log("volta pra casa criança")
} 

console.log()
console.log("===================")
console.log()

//------------ APOSENTADORIA MASCULINA
//regras: idad >= 62 e contribuicao >= 15
// contribuicao >= 35

let idadeaposentadoria = 60
let contribuicao = 35

if(idadeaposentadoria >= 62 && contribuicao >= 15){
    console.log("parabens vc pode se aposentar")
} else if (contribuicao >= 35){
    console.log("parabens vc pode se aposentar")
} else {
    console.log("sinto mt, vc n vai se aposentar")
}


