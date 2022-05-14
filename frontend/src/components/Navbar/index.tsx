import {ReactComponent as GithubIcon} from 'assets/img/github.svg';
import './styles.css';

function Navbar(){

    return(
        <header>
    <nav className="container">
        <div className="dsmovie-nav-content">
            <h1>
                <a href='/'>DSFilmes</a>
            </h1>
            <a href="https://github.com/Fernando-Oliver" target="_blank" rel="noreferrer">
                <div className="dsmovie-contact-container">
                    <GithubIcon />
                    <p className="dsmovie-contact-link">/Fernando de Oliveira</p>
                </div>
            </a>
        </div>
    </nav>
</header>
    );

}

export default Navbar;