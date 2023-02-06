package br.com.andersonemanuel.gyn.project.domain.physicalassessment

import jakarta.persistence.*

@Entity
@Table(name = "physical_assessment")
data class PhysicalAssessment (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    var id: Long? = null
)