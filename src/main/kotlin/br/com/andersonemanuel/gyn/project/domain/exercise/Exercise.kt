package br.com.andersonemanuel.gyn.project.domain.exercise

import jakarta.persistence.*

@Entity
@Table(name = "exercise")
data class Exercise (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    var id: Long? = null
)