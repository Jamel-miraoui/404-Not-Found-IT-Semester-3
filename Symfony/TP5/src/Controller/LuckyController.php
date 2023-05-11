<?php
namespace App\Controller;

use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\Routing\Annotation\Route;
use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;

class LuckyController extends AbstractController
{
    /**
     * @Route("/lucky/number", name="lucky_number")
     */
    public function number(): Response
    {
        $number = random_int(0, 100);
        return $this->render('lucky/number.html.twig', ['number' => $number]);
    }

    /**
     * @Route("/hello", name="hello")
     */
    public function hello(Request $request): Response
    {
        return $this->render('lucky/hello.html.twig');
    }
}
?>