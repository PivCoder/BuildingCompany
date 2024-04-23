import React, { useEffect, useState } from 'react'
import './AtHomeReady50.css'
import HouseCard from '../HouseCard/HouseCard'
import axios from 'axios'
const AtHomeReady50 = () => {
	const [update, setUpdate] = useState(false)
	const [house, sethouse] = useState([
		{
			id: 1,
			name: 'Дом 1',
			description: 'Описание дома...',
			images: 'someFolder',
			status: 'WAITING',
			area: 132.5,
			heatedArea: 100.2,
			numberOfFloors: 1,
			houseType: {
				id: 1,
				name: 'Дом с террасой',
				hibernateLazyInitializer: {},
			},
			materialType: {
				id: 1,
				name: 'Керамический кирпич',
				hibernateLazyInitializer: {},
			},
			percentageOfReadiness: 'PERCENT_50',
		},
		{
			id: 2,
			name: 'Дом 2',
			description: 'Описание дома...',
			images: 'someFolder',
			status: 'WAITING',
			area: 127.25,
			heatedArea: 100.78,
			numberOfFloors: 2,
			houseType: {
				id: 2,
				name: 'Таунхаус с террасой',
				hibernateLazyInitializer: {},
			},
			materialType: {
				id: 2,
				name: 'Брус',
				hibernateLazyInitializer: {},
			},
			percentageOfReadiness: 'PERCENT_0',
		},
		{
			id: 3,
			name: 'Дом 3',
			description: 'Описание дома...',
			images: 'someFolder',
			status: 'WAITING',
			area: 182.12,
			heatedArea: 100.53,
			numberOfFloors: 3,
			houseType: {
				id: 3,
				name: 'Коттедж с террасой',
				hibernateLazyInitializer: {},
			},
			materialType: {
				id: 3,
				name: 'Доска',
				hibernateLazyInitializer: {},
			},
			percentageOfReadiness: 'PERCENT_100',
		},
	])
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
					<h1>Дома 50% готовостью</h1>
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

export default AtHomeReady50
