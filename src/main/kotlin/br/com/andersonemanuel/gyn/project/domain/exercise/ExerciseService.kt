package br.com.andersonemanuel.gyn.project.domain.exercise

import br.com.andersonemanuel.gyn.project.domain.exercise.ExerciseRepository
import org.springframework.stereotype.Service

@Service
class ExerciseService(
    val repository: ExerciseRepository
) {

}