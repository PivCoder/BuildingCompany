import React from 'react'
import './AdditionalServices.css'
import HouseCard from '../HouseCard/HouseCard'

const AdditionalServices = () => {
	return (
		<>
			<div className='Housesfromscratch'>
				<div className='Housesfromscratch_container'>
					<h1>Дополнительные услуги</h1>
					<div className='housepull'>
						<HouseCard />
						<HouseCard />
						<HouseCard />
					</div>
				</div>
			</div>
		</>
	)
}

export default AdditionalServices
