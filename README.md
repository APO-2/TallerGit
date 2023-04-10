# Taller de Git

**NOTA:** Para trabajar en Windows debe utilizar `git bash` 

## Uso de la herramienta git flow

Git  flow es una métodoología de trabajo para el versionamiento de código fuente, en este taller usaremos la herramienta para ejemplificar el flujo de trabajo, *unicamente con tres ramas: master (o main), develop y feature/* 

1. En su repositorio de github, vamos a habilitar la opción que esta en: *Settings -> Automatically delete head branches*, esta opción nos ayudará a eliminar las ramas de tipo *feature/* que se crean con `git-flow` cuando su siclo de vida termina

2. Para inicializar un repositorio con `git-flow` vamos al repositorio local (en nuestra maquina con la terminal) y escribimos: 

```bash
git-flow init
```

esto producira una salida como esta: 

```
Branch name for production releases: [master] 
Branch name for "next release" development: [develop] 

How to name your supporting branch prefixes?
Feature branches? [feature/] 
Bugfix branches? [bugfix/] 
Release branches? [release/] 
Hotfix branches? [hotfix/] 
Support branches? [support/] 
Version tag prefix? [] version/
Hooks and filters directory? [/path/to/myRepository/.git/hooks]
```

Este comando nos ayuda a configurar todas las ramas que se usan en la métodología `git-flow`, luego de ejecutar este comando el `git` nos dejará en la rama `develop`

3. Una vez hecho esto, podemos empezar a trabajar con nuestro flujo, creado nuestras ramas `feature`, recuerde que estas ramas estan asociadas a una funcionalida del proyecto, el nombre de rama, puede variar dependiendo de la cultura organizacional de la empresa o del equipo de trabajo, para este caso, crearemos las ramas con el nombre del usuario seguido a un acronimo de la funcionalidad o el caso de prueba usado: 

| Nombre                    | Acronimo    |
| ------------------------- | ----------- |
| Requerimiento Funcional # | RF#         |
| Test Case #               | TC#         |

Entonces si queremos crear una `feature` para el *Requerimeinto Funcional 1*, hacemos: 

```bash
git-flow feature start userName_RF1
```

Esto creara la rama `feature/userName_RF1`