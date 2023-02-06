package br.com.andersonemanuel.gyn.project.domain.exercise;

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import java.util.*

interface ExerciseRepository : JpaRepository<Exercise, Long> {

}