import React from 'react'
import './CardHouseMini.css'
import house from './media/image 7.png'
import { Link } from 'react-router-dom'

const CardHouseMini = props => {
	return (
		<>
			<div className='CardHouseMini'>
				<img src={house} alt='house' />
				<div className='CardHouseMini-info'>
					<div className='CardHouseMini-info_text'>
						<span>Этажность</span>
						<span>{props.house.numberOfFloors} этажа</span>
					</div>
					<div className='CardHouseMini-info_text'>
						<span>Ширина</span>
						<span>{props.house.width} м</span>
					</div>
					<div className='CardHouseMini-info_text'>
						<span>Длина</span>
						<span>{props.house.length} м</span>
					</div>
				</div>
			</div>
		</>
	)
}

export default CardHouseMini
