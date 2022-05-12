import {ReactComponent as Seta} from 'assets/img/seta.svg';
import './style.css';
function Paginas(){

    return(
<div className="dsmovie-pagination-container">
    <div className="dsmovie-pagination-box">
        <button className="dsmovie-pagination-button" disabled={true} >
            <Seta />
        </button>
        <p>{`${1} de ${3}`}</p>
        <button className="dsmovie-pagination-button" disabled={false} >
            <Seta className="dsmovie-flip-horizontal" />
        </button>
    </div>
</div>
    );
}

export default Paginas