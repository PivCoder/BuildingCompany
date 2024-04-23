import React, { useEffect, useState } from 'react'
import './Housesfromscratch.css'
import axios from 'axios'
import HouseCard from '../HouseCard/HouseCard'

const Housesfromscratch = () => {
	const [update, setUpdate] = useState(false)
	const [house, sethouse] = useState([])
	async function getproduct1() {
		axios
			.get(`http://localhost:8087/rest/house/get`, {})
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
					<h1>Дома с нуля</h1>
					<div className='housepull'>
						{house.map((house, index) => (
							<HouseCard number={index + 1} house={house} key={house.id} />
						))}
					</div>
				</div>
			</div>
		</>
	)
}

export default Housesfromscratch
