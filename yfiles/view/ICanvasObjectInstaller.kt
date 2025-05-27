// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.graph.IModelItem
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * Installs visual representations of items in a [CanvasComponent].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICanvasObjectInstaller">Online Documentation</a>
 */
external interface ICanvasObjectInstaller<in T : IModelItem> : YObject {
/**
 * This the main method of the interface that performs the installation of an item's visual representation in the [canvas][CanvasComponent] by adding [ICanvasObject]s.
 * @param [context] The context that contains the information required to install the visual representation.
 * @param [group] The canvas object group to add the newly generated [ICanvasObject] to.
 * @param [item] The item to install.
 * @return The newly generated [ICanvasObject] for the item's visual representation. `null` if nothing was installed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICanvasObjectInstaller%23ICanvasObjectInstaller-method-addCanvasObject">Online Documentation</a>
 */
   fun addCanvasObject( context: ICanvasContext ,
 group: ICanvasObjectGroup ,
 item: T ):ICanvasObject?

companion object : InterfaceMetadata<ICanvasObjectInstaller<*>> {

/**
 * Creates an implementation of the interface [ICanvasObjectInstaller] by using the given function as implementation for its [addCanvasObject] method.
 * @param [addCanvasObject] A function for [ICanvasObjectInstaller]'s single abstract method [addCanvasObject].
 * @return An instance of the [ICanvasObjectInstaller] interface based on the given function.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICanvasObjectInstaller%23ICanvasObjectInstaller-method-create">Online Documentation</a>
 */
            @JsName("create")
            operator fun <T : IModelItem> invoke(
                addCanvasObject: (
            context: ICanvasContext,
group: ICanvasObjectGroup,
item: T
            ) -> ICanvasObject 
            ):ICanvasObjectInstaller<T>
}
}
