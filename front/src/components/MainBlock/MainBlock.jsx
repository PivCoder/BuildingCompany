import React from 'react'
import './MainBlock.css'
import ico1 from './media/ico1.png'
import ico2 from './media/ico2.png'
import Feedback from '../Feedback/Feedback'
import CompletedProjects from '../CompletedProjects/CompletedProjects'
const MainBlock = () => {
	return (
		<>
			<div className='Main'>
				<div className='Main__firstsection'>
					<div className='firstsection__container'>
						<h1>Индивидуальный подход к каждой детали!</h1>
						<p>
							Создаем пространство, которое вы будете любить и использовать с
							удовольствием
						</p>
					</div>
				</div>
				<div className='Main__secondsection'>
					<div className='secondsection-right'>
						<h2>О нас</h2>
						<p>
							Наша команда готова взяться за самые сложные и нестандартные
							задачи. Мы ценим индивидуальность каждого клиента и стремимся к
							тому, чтобы наше обслуживание было именно под его потребности. Наш
							подход к работе - это не только профессионализм и качество, но и
							внимание к деталям и желаниям каждого клиента.
						</p>
						<button>Каталог</button>
					</div>
					<div className='secondsection-left'>
						<img src={ico1} alt='ico1' />
						<img src={ico2} alt='ico2' />
					</div>
				</div>
				<Feedback />
				<CompletedProjects />
			</div>
		</>
	)
}

export default MainBlock
