import { Route, Routes } from 'react-router-dom'
import './App.css'
import AboutUs from './components/AboutUs/AboutUs'
import FAQ from './components/FAQ/FAQ'
import Footer from './components/Footer/Footer'
import Header from './components/Header/Header'
import Housesfromscratch from './components/Housesfromscratch/Housesfromscratch'
import MainBlock from './components/MainBlock/MainBlock'
import Region from './components/Region/Region'
import Feedback from './components/Feedback/Feedback'
import AtHomeReady50 from './components/AtHomeReady50/AtHomeReady50'
import ReadyMadeHouses from './components/ReadyMadeHouses/Housesfromscratch'
import Plots from './components/Plots/Plots'
import AdditionalServices from './components/AdditionalServices/AdditionalServices'
import TypeOfHouse from './components/TypeOfHouse/TypeOfHouse'
import Layouts from './components/Layouts/Layouts'

function App() {
	return (
		<div className='App'>
			<Header />
			<Routes>
				<Route path='/AboutUs' element={<AboutUs />} />
				<Route path='/FAQ' element={<FAQ />} />
				<Route path='/Housesfromscratch' element={<Housesfromscratch />} />
				<Route path='/' element={<MainBlock />} />
				<Route path='/Region' element={<Region />} />
				<Route path='/Feedback' element={<Feedback />} />
				<Route path='/AtHomeReady50' element={<AtHomeReady50 />} />
				<Route path='/ReadyMadeHouses' element={<ReadyMadeHouses />} />
				<Route path='/Plots' element={<Plots />} />
				<Route path='/AdditionalServices' element={<AdditionalServices />} />
				<Route path='/TypeOfHouse' element={<TypeOfHouse />} />
				<Route path='/Layouts' element={<Layouts />} />
			</Routes>
			<Footer />
		</div>
	)
}

export default App
