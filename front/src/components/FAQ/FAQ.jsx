import React, { useState } from 'react'
import './FAQ.css'
import arrow from './Question/media/arrow_drop_down.png'
import Question from './Question/Question'

const FAQ = () => {
	const [bottom1, setbottom1] = useState('question__bottom')
	const [bottom2, setbottom2] = useState('question__bottom')
	const [bottom3, setbottom3] = useState('question__bottom')
	const [arrow1, setarrow1] = useState('')
	const [arrow2, setarrow2] = useState('')
	const [arrow3, setarrow3] = useState('')

	const active1 = e => {
		e.preventDefault()
		if (arrow1 === '') {
			setbottom1('question__bottom active')
			setarrow1('active')
		} else {
			setbottom1('question__bottom')
			setarrow1('')
		}
	}
	const active2 = e => {
		e.preventDefault()
		if (arrow2 === '') {
			setbottom2('question__bottom active')
			setarrow2('active')
		} else {
			setbottom2('question__bottom')
			setarrow2('')
		}
	}
	const active3 = e => {
		e.preventDefault()
		if (arrow3 === '') {
			setbottom3('question__bottom active')
			setarrow3('active')
		} else {
			setbottom3('question__bottom')
			setarrow3('')
		}
	}
	return (
		<>
			<div className='FAQ'>
				<div className='FAQ_container'>
					<h1>Часто задаваемые вопросы</h1>
					<div className='FAQ__pull'>
						<div className='Question'>
							<div className='question__top'>
								<span>
									Как производится оплата по договору и какой порядок платежей?
								</span>
								<img
									src={arrow}
									onClick={active1}
									className={arrow1}
									alt='arrow'
								/>
							</div>
							<div className={bottom1}>
								<span>
									Оплата производится наличными в кассу или безналичным способом
									на расчетный счет компании (через банк или интернет банк)
									Жестко фиксированного графика оплаты у нас нет, зачастую он
									согласовывается с Вами индивидуально, но тем не менее
									материалы на этап работ (фундамент, стены, крыша) оплачиваются
									наперед.
								</span>
							</div>
						</div>
						<div className='Question'>
							<div className='question__top'>
								<span>
									Можно ли заказать только строительство фундамента или только
									кладку?
								</span>
								<img
									src={arrow}
									onClick={active2}
									className={arrow2}
									alt='arrow'
								/>
							</div>
							<div className={bottom2}>
								<span>
									Оплата производится наличными в кассу или безналичным способом
									на расчетный счет компании (через банк или интернет банк)
									Жестко фиксированного графика оплаты у нас нет, зачастую он
									согласовывается с Вами индивидуально, но тем не менее
									материалы на этап работ (фундамент, стены, крыша) оплачиваются
									наперед.
								</span>
							</div>
						</div>
						<div className='Question'>
							<div className='question__top'>
								<span>
									Мы хотим построить дом по индивидуальному проекту, у нас есть
									идеи и наброски? Сколько это стоит?
								</span>
								<img
									src={arrow}
									onClick={active3}
									className={arrow3}
									alt='arrow'
								/>
							</div>
							<div className={bottom3}>
								<span>
									Оплата производится наличными в кассу или безналичным способом
									на расчетный счет компании (через банк или интернет банк)
									Жестко фиксированного графика оплаты у нас нет, зачастую он
									согласовывается с Вами индивидуально, но тем не менее
									материалы на этап работ (фундамент, стены, крыша) оплачиваются
									наперед.
								</span>
							</div>
						</div>
					</div>
				</div>
			</div>
		</>
	)
}

export default FAQ
