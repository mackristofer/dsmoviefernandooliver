import MovieCard from "components/moviecard";
import Paginas from "components/paginas";


function Listing(){

    return(
        <>
         <Paginas />

         <div className="container">
         <div className="row">
          <div className="col-sm-6 col-lg-4 col-xl-3 mb-3">
          <MovieCard />
          </div>
          <div className="col-sm-6 col-lg-4 col-xl-3 mb-3">
          <MovieCard />
          </div>
          <div className="col-sm-6 col-lg-4 col-xl-3 mb-3">
          <MovieCard />
          </div>
         </div>
         </div>
        </>
       
    );

    
}

export default Listing;