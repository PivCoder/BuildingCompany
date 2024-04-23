import React, { useEffect, useState } from 'react'
import './Layouts.css'
import axios from 'axios'
import PlotCard from '../PlotCard/PlotCard'
import CardHouseMini from '../CardHouseMini/CardHouseMini'

const Layouts = () => {
	const [update, setUpdate] = useState(false)
	const [house, sethouse] = useState([
		{
			id: 4,
			name: 'Компактная',
			description: 'Описание планировки...',
			images: 'someFolder',
			status: 'WAITING',
			length: 150.0,
			width: 250.25,
			numberOfFloors: 1,
		},
		{
			id: 5,
			name: 'Просторная',
			description: 'Описание планировки...',
			images: 'someFolder',
			status: 'WAITING',
			length: 120.0,
			width: 375.15,
			numberOfFloors: 2,
		},
		{
			id: 6,
			name: 'Коробка',
			description: 'Описание планировки...',
			images: 'someFolder',
			status: 'WAITING',
			length: 170.0,
			width: 185.2,
			numberOfFloors: 3,
		},
		{
			id: 6,
			name: 'Коробка',
			description: 'Описание планировки...',
			images: 'someFolder',
			status: 'WAITING',
			length: 170.0,
			width: 185.2,
			numberOfFloors: 3,
		},
	])
	async function getproduct1() {
		axios
			.get(`http://localhost:8087/rest/planning/get`, {})
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
			<div className='Layouts'>
				<div className='Layouts_container'>
					<h1>Планировки</h1>
					<div className='Layoutspull'>
						{house.map((house, index) => (
							<CardHouseMini number={index + 1} house={house} key={house.id} />
						))}
					</div>
				</div>
			</div>
		</>
	)
}

export default Layouts
