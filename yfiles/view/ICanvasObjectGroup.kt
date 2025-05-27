// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.collections.IListEnumerable
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * This is the interface implemented by the composite building blocks of a scene graph in a [CanvasComponent].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICanvasObjectGroup">Online Documentation</a>
 */
external interface ICanvasObjectGroup : ICanvasObject, IListEnumerable<ICanvasObject> {
/**
 * Gets the first item in the rendering list of this group or `null`.
 * @see [IListEnumerable]
 * @see [IEnumerable.getEnumerator][yfiles.collections.IEnumerable.getEnumerator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICanvasObjectGroup%23firstChild">Online Documentation</a>
 */
val firstChild: ICanvasObject?
/**
 * Gets the last item in the rendering list of this group or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICanvasObjectGroup%23lastChild">Online Documentation</a>
 */
val lastChild: ICanvasObject?
/**
 * Adds a child element to the scene graph as a child of this group.
 * @param [userObject] The user object to associate with this child element. This object will be passed to the `descriptor`'s methods.
 * @param [descriptor] An implementation of the [ICanvasObjectDescriptor] interface that will be passed the `userObject` to provide the various implementations that are used during rendering. If no descriptor is passed, [ICanvasObjectDescriptor.ALWAYS_DIRTY_INSTANCE] is used by the default implementation.
 * @return A handle that can be used to control the rendering order and to later [remove][ICanvasObject.remove] the element from the scene graph, again.
 * @see [ICanvasObjectDescriptor]
 * @see [ICanvasObjectDescriptor.ALWAYS_DIRTY_INSTANCE]
 * @see [ICanvasObjectDescriptor.DYNAMIC_DIRTY_INSTANCE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICanvasObjectGroup%23ICanvasObjectGroup-method-addChild">Online Documentation</a>
 */
   fun <T : YObject>addChild( userObject: T ,
 descriptor: ICanvasObjectDescriptor<T>?  = definedExternally):ICanvasObject
/**
 * Adds a new [ICanvasObjectGroup] to this group in the current scene graph.
 * @return A handle to the newly created group that can be used to control the rendering order and to later [remove][ICanvasObject.remove] the group from the scene graph, again.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICanvasObjectGroup%23ICanvasObjectGroup-method-addGroup">Online Documentation</a>
 */
   fun addGroup():ICanvasObjectGroup

companion object : InterfaceMetadata<ICanvasObjectGroup> {
}
}
