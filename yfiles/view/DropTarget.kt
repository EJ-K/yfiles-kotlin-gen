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

/**
 * Helper class that plays the role of the target during a drag and drop operation that is initiated using [startDrag][DragSource] in a [DragSource].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropTarget">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [DropTarget] class.
 * @see [setDropTarget]
 * @see [getDropTarget]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropTarget%23DropTarget-constructor-DropTarget">Online Documentation</a>
 */
external class DropTarget () : IEventDispatcher {
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
  
  companion object : ClassMetadata<DropTarget> {
    /**
     * Gets the [DropTarget] instance associated with the given element.
     * @receiver The element to get the drop target instance of.
     * @return The associated instance or `null`.
     * @see [setDropTarget]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropTarget%23DropTarget-method-getDropTarget">Online Documentation</a>
     */
    fun Element.getDropTarget(): DropTarget?
    
    /**
     * Sets the drop target for the given element.
     * @receiver The element to register the drop target instance with.
     * @param [dropTarget] The instance to attach to the element or `null` to remove the association from the element.
     * @see [getDropTarget]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropTarget%23DropTarget-method-setDropTarget">Online Documentation</a>
     */
    fun Element.setDropTarget(
      dropTarget: DropTarget?,
    )
  }
}

inline fun DropTarget(
    block: DropTarget.() -> Unit
): DropTarget {
    return DropTarget()
        .apply(block)
}

/**
 * `drag-enter`: Occurs when a drag enters the drop target.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropTarget%23drag-enter">Online Documentation</a>
 */
inline fun  DropTarget.addDragEnterHandler(
  crossinline handler: (event:DragEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<DragEventArgs> = { event, _ -> handler(event) }
  addEventListener("drag-enter", listener)
  return { removeEventListener("drag-enter", listener) }
}

/**
 * `drag-leave`: Occurs when a drag leaves the drop target.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropTarget%23drag-leave">Online Documentation</a>
 */
inline fun  DropTarget.addDragLeaveHandler(
  crossinline handler: (event:DragEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<DragEventArgs> = { event, _ -> handler(event) }
  addEventListener("drag-leave", listener)
  return { removeEventListener("drag-leave", listener) }
}

/**
 * `drag-over`: Occurs when a drag is being performed over the drop target.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropTarget%23drag-over">Online Documentation</a>
 */
inline fun  DropTarget.addDragOverHandler(
  crossinline handler: (event:DragEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<DragEventArgs> = { event, _ -> handler(event) }
  addEventListener("drag-over", listener)
  return { removeEventListener("drag-over", listener) }
}

/**
 * `drop`: Occurs when the drop operation is performed on the drop target.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropTarget%23drop">Online Documentation</a>
 */
inline fun  DropTarget.addDropHandler(
  crossinline handler: (event:DragEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<DragEventArgs> = { event, _ -> handler(event) }
  addEventListener("drop", listener)
  return { removeEventListener("drop", listener) }
}
