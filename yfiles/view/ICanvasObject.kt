// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * This is the interface implemented by the basic building blocks of a scene graph in a [CanvasComponent].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICanvasObject">Online Documentation</a>
 */
external interface ICanvasObject : YObject {
/**
 * Gets or sets the descriptor instance that interprets the [userObject] during rendering, hit testing, and bounds calculation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICanvasObject%23descriptor">Online Documentation</a>
 */
var descriptor: ICanvasObjectDescriptor<*>
/**
 * Gets or sets a flag that indicates whether [ICanvasObject] needs to be updated during the next call to [CanvasComponent.invalidate].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICanvasObject%23dirty">Online Documentation</a>
 */
var dirty: Boolean
/**
 * Gets or sets the parent group of this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICanvasObject%23group">Online Documentation</a>
 */
var group: ICanvasObjectGroup?
/**
 * Gets the next item in the list of rendered items that is owned by this element's [group].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICanvasObject%23nextSibling">Online Documentation</a>
 */
val nextSibling: ICanvasObject?
/**
 * Gets the previous item in the list of rendered items that is owned by this element's [group].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICanvasObject%23previousSibling">Online Documentation</a>
 */
val previousSibling: ICanvasObject?
/**
 * Gets or sets the user object associated with this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICanvasObject%23userObject">Online Documentation</a>
 */
var userObject: Any?
/**
 * Gets or sets the visibility state of this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICanvasObject%23visible">Online Documentation</a>
 */
var visible: Boolean
/**
 * Moves this instance exactly behind the reference item in the referenced item's group rendering list, so that it will be rendered directly above the given reference.
 * @return `this` so that calls can be chained.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICanvasObject%23ICanvasObject-method-above">Online Documentation</a>
 */
 infix   fun above( reference: ICanvasObject ):ICanvasObject
/**
 * Moves this instance exactly before the reference item in the referenced item's group rendering list, so that it will be rendered directly behind the given reference.
 * @return `this` so that calls can be chained.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICanvasObject%23ICanvasObject-method-below">Online Documentation</a>
 */
 infix   fun below( reference: ICanvasObject ):ICanvasObject
/**
 * Moves this instance one step closer to the beginning of the group rendering list, so that it will be rendered behind its current predecessor.
 * @return `this` so that calls can be chained.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICanvasObject%23ICanvasObject-method-lower">Online Documentation</a>
 */
   fun lower():ICanvasObject
/**
 * Moves this instance one step closer to the end of the group rendering list, so that it will be rendered on top of its current successor.
 * @return `this` so that calls can be chained.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICanvasObject%23ICanvasObject-method-raise">Online Documentation</a>
 */
   fun raise():ICanvasObject
/**
 * Removes this item from the scene graph it currently belongs to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICanvasObject%23ICanvasObject-method-remove">Online Documentation</a>
 */
   fun remove()
/**
 * Moves this instance to the beginning of the group rendering list, so that it will be rendered behind all other items in the same group.
 * @return `this` so that calls can be chained.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICanvasObject%23ICanvasObject-method-toBack">Online Documentation</a>
 */
   fun toBack():ICanvasObject
/**
 * Moves this instance to the end of the group rendering list, so that it will be rendered in front of all other items in the same group.
 * @return `this` so that calls can be chained.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICanvasObject%23ICanvasObject-method-toFront">Online Documentation</a>
 */
   fun toFront():ICanvasObject

companion object : InterfaceMetadata<ICanvasObject> {
}
}
