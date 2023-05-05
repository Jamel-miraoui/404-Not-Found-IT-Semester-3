<?php
// src/Controller/LuckyController.php
namespace App\Controller;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\Routing\Annotation\Route;
use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
use Symfony\Component\HttpFoundation\Request;

class LuckyController extends AbstractController
{
    /**
     * @Route("/lucky/number")
     */

Public function number()
{
    $number=random_int(0,100);
    return $this->render('lucky/number.html.twig',['number'=>$number,]);
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