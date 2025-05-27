// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import web.dom.Element
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.lang.YObject

/**
 * Helper class that plays the role of the target during a drag and drop operation that is initiated using [DragSource.startDrag] in a [DragSource].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropTarget">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [DropTarget] class.
 * @see [setDropTarget]
 * @see [getDropTarget]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropTarget%23DropTarget-constructor-DropTarget">Online Documentation</a>
 */
external open class DropTarget  () : YObject, IEventDispatcher {

/**
 * Gets or sets a value indicating whether dropping to this target is currently allowed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropTarget%23allowDrop">Online Documentation</a>
 */
final var allowDrop: Boolean
/**
 * The element that is registered for this drop target.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropTarget%23element">Online Documentation</a>
 */
final val element: Element?
/**
 * Occurs when a drag enters the drop target.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropTarget%23DragEnter">Online Documentation</a>
 */
fun addDragEnterListener(listener: EventHandler1<DragEventArgs>)
fun removeDragEnterListener(listener: EventHandler1<DragEventArgs>)

/**
 * Occurs when a drag leaves the drop target.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropTarget%23DragLeave">Online Documentation</a>
 */
fun addDragLeaveListener(listener: EventHandler1<DragEventArgs>)
fun removeDragLeaveListener(listener: EventHandler1<DragEventArgs>)

/**
 * Occurs when a drag is being performed over the drop target.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropTarget%23DragOver">Online Documentation</a>
 */
fun addDragOverListener(listener: EventHandler1<DragEventArgs>)
fun removeDragOverListener(listener: EventHandler1<DragEventArgs>)

/**
 * Occurs when the drop operation is performed on the drop target.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropTarget%23Drop">Online Documentation</a>
 */
fun addDropListener(listener: EventHandler1<DragEventArgs>)
fun removeDropListener(listener: EventHandler1<DragEventArgs>)

companion object : ClassMetadata<DropTarget> {
/**
 * Gets the [DropTarget] instance associated with the given element.
 * @receiver The element to get the drop target instance of.
 * @return The associated instance or `null`.
 * @see [setDropTarget]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropTarget%23DropTarget-method-getDropTarget">Online Documentation</a>
 */
 final   fun Element.getDropTarget():DropTarget?
/**
 * Sets the drop target for the given element.
 * @receiver The element to register the drop target instance with.
 * @param [dropTarget] The instance to attach to the element or `null` to remove the association from the element.
 * @see [getDropTarget]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropTarget%23DropTarget-method-setDropTarget">Online Documentation</a>
 */
 final   fun Element.setDropTarget( dropTarget: DropTarget? )
}
}

inline fun DropTarget(
    block: DropTarget.() -> Unit
): DropTarget {
    return DropTarget()
        .apply(block)
}

/**
 * Occurs when a drag enters the drop target.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropTarget%23DragEnter">Online Documentation</a>
 */
inline fun  DropTarget.addDragEnterHandler(
    crossinline handler: (event:DragEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<DragEventArgs> = { _, event -> handler(event) }
    addDragEnterListener(listener)
    return { removeDragEnterListener(listener) }
}
/**
 * Occurs when a drag leaves the drop target.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropTarget%23DragLeave">Online Documentation</a>
 */
inline fun  DropTarget.addDragLeaveHandler(
    crossinline handler: (event:DragEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<DragEventArgs> = { _, event -> handler(event) }
    addDragLeaveListener(listener)
    return { removeDragLeaveListener(listener) }
}
/**
 * Occurs when a drag is being performed over the drop target.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropTarget%23DragOver">Online Documentation</a>
 */
inline fun  DropTarget.addDragOverHandler(
    crossinline handler: (event:DragEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<DragEventArgs> = { _, event -> handler(event) }
    addDragOverListener(listener)
    return { removeDragOverListener(listener) }
}
/**
 * Occurs when the drop operation is performed on the drop target.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropTarget%23Drop">Online Documentation</a>
 */
inline fun  DropTarget.addDropHandler(
    crossinline handler: (event:DragEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<DragEventArgs> = { _, event -> handler(event) }
    addDropListener(listener)
    return { removeDropListener(listener) }
}
