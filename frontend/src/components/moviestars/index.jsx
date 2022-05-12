import {ReactComponent as Estrelacheia} from 'assets/img/estrela.svg';
import {ReactComponent as Meiaestrela} from 'assets/img/meiaestrela.svg';
import {ReactComponent as Estrelavazia} from 'assets/img/estrelavazia.svg';
import './style.css';

function MovieStars(){
    return(
        <div className="dsmovie-stars-container">
        <Estrelacheia />
        <Estrelacheia />
        <Estrelacheia />
        <Meiaestrela />
        <Estrelavazia />
      </div>
    );
}

export default MovieStars;