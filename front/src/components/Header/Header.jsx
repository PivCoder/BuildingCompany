import React, { useEffect, useState } from 'react'
import './Header.css'
import logo from './media/Лого.png'
import { Link } from 'react-router-dom'
const Header = () => {
	const [update, setUpdate] = useState(false)
	const [link1, setlink1] = useState('')
	const [link2, setlink2] = useState('')
	const [link3, setlink3] = useState('')
	const [link4, setlink4] = useState('')
	const [link5, setlink5] = useState('')
	const [link6, setlink6] = useState('')
	const [link7, setlink7] = useState('')
	const [link8, setlink8] = useState('')
	const [link9, setlink9] = useState('')
	const [link10, setlink10] = useState('')
	const [link11, setlink11] = useState('')

	const [Dropdown, setDropdown] = useState('header__menu none')
	const breakout = () => {
		setlink1('')
		setlink2('')
		setlink3('')
		setlink4('')
		setlink5('')
		setlink6('')
		setlink7('')
		setlink8('')
		setlink9('')
		setlink10('')
		setlink11('')
	}

	const activeLink = () => {
		switch (window.location.href) {
			case 'http://localhost:3000/':
				breakout()
				setlink1('activeLink')
				break
			case 'http://localhost:3000/Housesfromscratch':
				breakout()
				setlink2('activeLink')
				break
			case 'http://localhost:3000/Region':
				breakout()
				setlink3('activeLink')
				break
			case 'http://localhost:3000/AboutUs':
				breakout()
				setlink4('activeLink')
				break
			case 'http://localhost:3000/FAQ':
				breakout()
				setlink5('activeLink')
				break
			case 'http://localhost:3000/Feedback':
				breakout()
				setlink6('activeLink')
				break

			default:
				break
		}
	}
	console.log(window.location.href)
	useEffect(() => {
		if (update) return
		activeLink()
	}, [update])
	return (
		<>
			<header>
				<div className='header-top'>
					<div className='header-top__content'>
						<ul>
							<li>г. Самара</li>
							<li>+7********** / +7**********</li>
							<li>***********@mail.ru</li>
						</ul>
					</div>
				</div>
				<div className='header-bottom'>
					<img src={logo} alt='logo' />
					<nav>
						<ul>
							<Link
								onClick={() => {
									breakout()
									setlink1('activeLink')
								}}
								className={link1}
								to={'/'}
							>
								Главная
							</Link>

							<span
								onClick={() => {
									if (Dropdown === 'header__menu none') {
										setDropdown('header__menu')
									} else {
										setDropdown('header__menu none')
									}
								}}
								className={link2}
							>
								Услуги
							</span>
							<Link
								onClick={() => {
									breakout()
									setlink3('activeLink')
								}}
								className={link3}
								to={'/Layouts'}
							>
								Планировки
							</Link>
							<Link
								onClick={() => {
									breakout()
									setlink4('activeLink')
								}}
								className={link4}
								to={'/AboutUs'}
							>
								О нас
							</Link>
							<Link
								onClick={() => {
									breakout()
									setlink5('activeLink')
								}}
								className={link5}
								to={'/FAQ'}
							>
								FAQ
							</Link>
							<Link
								onClick={() => {
									breakout()
									setlink6('activeLink')
								}}
								className={link6}
								to={'/Feedback'}
							>
								Свяжитесь с нами
							</Link>
						</ul>
					</nav>
				</div>
				<div className={Dropdown}>
					<Link
						onClick={() => {
							breakout()
							setlink2('activeLink')
							setlink7('activeLink')
							setDropdown('header__menu none')
						}}
						className={link7}
						to={'/Housesfromscratch'}
					>
						Дома с нуля
					</Link>
					<Link
						onClick={() => {
							breakout()
							setlink2('activeLink')
							setlink8('activeLink')
							setDropdown('header__menu none')
						}}
						className={link8}
						to={'/AtHomeReady50'}
					>
						Дома 50% готовности
					</Link>
					<Link
						onClick={() => {
							breakout()
							setlink2('activeLink')
							setlink9('activeLink')
							setDropdown('header__menu none')
						}}
						className={link9}
						to={'/ReadyMadeHouses'}
					>
						Готовые дома
					</Link>
					<Link
						onClick={() => {
							breakout()
							setlink2('activeLink')
							setlink10('activeLink')
							setDropdown('header__menu none')
						}}
						className={link10}
						to={'/Plots'}
					>
						Участки
					</Link>
					{/* <Link
						onClick={() => {
							breakout()
							setlink2('activeLink')
							setlink11('activeLink')
						}}
						className={link11}
						to={'/AdditionalServices'}
					>
						Дополнительные услуги
					</Link> */}
				</div>
			</header>
		</>
	)
}

export default Header
