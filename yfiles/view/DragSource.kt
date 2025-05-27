// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import js.promise.Promise
import web.dom.Element
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.lang.YObject

/**
 * Helper class for drag and drop support that is used for the source of drag and drop operations.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragSource">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [DragSource] class, optionally setting the [source] property to the given element.
 * @param [source] The source that is considered the origin of the drag. Will be set to [source]. If non-null - the [allowDrag] property can be used to conveniently register drag start event listeners on the element.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragSource%23DragSource-constructor-DragSource">Online Documentation</a>
 * 
 * @property source
 * Gets or sets the source element from which drags can originate.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragSource%23source">Online Documentation</a>
 */
external open class DragSource  (
final val source: Element /* HTMLElement | SVGElement */? = definedExternally) : YObject, IEventDispatcher {

/**
 * Gets or sets a value indicating whether default drag gestures should be automatically recognized on the [source].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragSource%23allowDrag">Online Documentation</a>
 */
final var allowDrag: Boolean
/**
 * Gets or sets the [DragDropEffects] that will be used for the [automatic drag operation][allowDrag].
 * @see [item]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragSource%23effectAllowed">Online Documentation</a>
 */
final var effectAllowed: DragDropEffects
/**
 * Gets or sets the data that will be used for the [automatic drag operation][allowDrag].
 * @see [effectAllowed]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragSource%23item">Online Documentation</a>
 */
final var item: DragDropItem?
/**
 * Cleans up by removing the association with the [source] element.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragSource%23DragSource-method-cleanUp">Online Documentation</a>
 */
 final   fun cleanUp()
/**
 * Raises the [QueryContinueDrag] event.
 * @param [event] The [QueryContinueDragEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragSource%23DragSource-method-onQueryContinueDrag">Online Documentation</a>
 */
 open protected   fun onQueryContinueDrag( event: QueryContinueDragEventArgs )
/**
 * Initiates a new drag operation using the provided drag data and effects.
 * @param [dragData] The data to use for the drag.
 * @param [dragDropEffects] The allowed effects.
 * @param [useCssCursors] Whether to adjust the classes of elements being hovered over during the drag. The default is `true`.
 * @param [dragPreview] Optional element that should be shown during dragging, e.g. outside of the [GraphComponent]. Note that this feature requires support for CSS pointer-events and should not be used in browsers that do not support it.
 * @return A [Promise] that resolves when the drag operation is done. It resolves to `true` on a successful drop and to `false` if the drag operation was canceled or otherwise unsuccessful.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragSource%23DragSource-method-startDrag">Online Documentation</a>
 */
 open   fun startDrag( dragData: DragDropItem ,
 dragDropEffects: DragDropEffects  = definedExternally,
 useCssCursors: Boolean  = definedExternally,
 dragPreview: Element /* HTMLElement | SVGElement */?  = definedExternally):Promise<Boolean>
/**
 * Occurs when the state of the [DragDropKeyStates] or the [DropTarget] has changed to query the source whether the drag operation should be continued.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragSource%23QueryContinueDrag">Online Documentation</a>
 */
fun addQueryContinueDragListener(listener: EventHandler1<QueryContinueDragEventArgs>)
fun removeQueryContinueDragListener(listener: EventHandler1<QueryContinueDragEventArgs>)

companion object : ClassMetadata<DragSource> {
}
}

inline fun DragSource(
    block: DragSource.() -> Unit
): DragSource {
    return DragSource()
        .apply(block)
}

/**
 * Occurs when the state of the [DragDropKeyStates] or the [DropTarget] has changed to query the source whether the drag operation should be continued.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragSource%23QueryContinueDrag">Online Documentation</a>
 */
inline fun  DragSource.addQueryContinueDragHandler(
    crossinline handler: (event:QueryContinueDragEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<QueryContinueDragEventArgs> = { _, event -> handler(event) }
    addQueryContinueDragListener(listener)
    return { removeQueryContinueDragListener(listener) }
}
