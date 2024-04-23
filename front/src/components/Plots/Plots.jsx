import React, { useEffect, useState } from 'react'
import './Plots.css'
import axios from 'axios'
import PlotCard from '../PlotCard/PlotCard'

const Plots = () => {
	const [update, setUpdate] = useState(false)
	const [house, sethouse] = useState([])
	async function getproduct1() {
		axios
			.get(`http://localhost:8087/rest/plot/get`, {})
			.then(response => {
				sethouse(response.data)
			})
			.catch(function (error) {
				console.log(error)
			})
	}
	useEffect(() => {
		if (update) return
		getproduct1()
	}, [update])
	return (
		<>
			<div className='Housesfromscratch'>
				<div className='Housesfromscratch_container'>
					<h1>Участки</h1>
					<div className='housepull'>
						{house.map((house, index) => (
							<PlotCard number={index + 1} house={house} key={house.id} />
						))}
					</div>
				</div>
			</div>
		</>
	)
}

export default Plots
