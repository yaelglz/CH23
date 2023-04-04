import logo from './logo.svg';
import './App.css';
import PrimerCompenente from './misComponentes/PrimerCompenente';
import { SegundoCompenente } from './misComponentes/SegundoCompenente';
import TercerComponente from './misComponentes/TercerComponente';
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Contacto from './pages/contacto';

function App() {
  const datos = {
    lugar: "México",
    hobbies: "Programar, leer, escuchar música"
  }
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <BrowserRouter>
          <Routes>
            <Route path="/" element={<div>Hey!</div>} />
            <Route path="/segundo" element={<div>ZZZZ</div>} />
            <Route path="/contacto" element={<Contacto />} />
          </Routes>
        </BrowserRouter>
        <p>
          {/* Edit <code>src/App.js</code> and save to reload. */}
          Hola Mundo
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
        <div className='componentes'>
          <hr />
          <SegundoCompenente nombre="Nictez" apellido="Sly" info = {datos} />
          <hr />
          <PrimerCompenente />
          <hr />
          <TercerComponente />
        </div>
      </header>
    </div>
  );
}

export default App;
