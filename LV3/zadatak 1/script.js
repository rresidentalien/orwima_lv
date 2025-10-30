function Prikazi(broj) {
    let rezultat = document.getElementById('result');
    rezultat.textContent = 'Rezultat: ' + broj;
}

function UzmiBrojeve() {
    let a = parseFloat(document.getElementById('prviBroj').value);
    let b = parseFloat(document.getElementById('drugiBroj').value);
    return { a, b };
}

function Zbroji() {
    let { a, b } = UzmiBrojeve();
    Prikazi(a + b);
}

function Oduzmi() {
    let { a, b } = UzmiBrojeve();
    Prikazi(a - b);
}

function Pomnozi() {
    let { a, b } = UzmiBrojeve();
    Prikazi(a * b);
}

function Podijeli() {
    let { a, b } = UzmiBrojeve();
    Prikazi(a / b);
}