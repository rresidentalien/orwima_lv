function Prikazi(broj) {
    let rezultat = document.getElementById('result');
    rezultat.textContent = 'Rezultat: ' + broj;
}

function UzmiA() {
    let a = parseFloat(document.getElementById('prviBroj').value)
}

function UzmiB() {
    let b = parseFloat(document.getElementById('drugiBroj').value)
}

function Zbroji() {
    let a = UzmiA()
    let b = UzmiB()

    Prikazi(a + b);
}

function Oduzmi() {
    let a = UzmiA()
    let b = UzmiB()

    Prikazi(a - b);
}

function Pomnozi() {
    let a = UzmiA()
    let b = UzmiB()

    Prikazi(a * b);
}

function Podijeli() {
    let a = UzmiA()
    let b = UzmiB()

    Prikazi(a / b);
}