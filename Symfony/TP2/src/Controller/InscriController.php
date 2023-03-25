<?php

namespace App\Controller;

use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\Routing\Annotation\Route;

class InscriController extends AbstractController
{
    #[Route('/inscri', name: 'app_inscri')]
    public function index(): Response
    {
        return $this->render('inscri/index.html.twig', [
            'controller_name' => 'InscriController',
        ]);
    }


    public function voir(): Response
    {
        return $this->render('inscri/voir.html.twig', [
            'controller_name' => 'InscriController',
        ]);
    }

    public function ajouter(): Response
    {
        return $this->render('inscri/ajouter.html.twig', [
            'controller_name' => 'InscriController',
        ]);
    }

    public function supprimer(): Response
    {
        return $this->render('inscri/supprimer.html.twig', [
            'controller_name' => 'InscriController',
        ]);
    }
}
