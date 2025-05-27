// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.IRectangle
import yfiles.geometry.ISize
import yfiles.geometry.Point
import yfiles.graph.INode
import yfiles.lang.ClassMetadata

/**
 * The default [IHandle] implementation for nodes that uses [IReshapeHandler] for the actual reshaping.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeReshapeHandlerHandle">Online Documentation</a>
 * 
 * @constructor Default constructor that creates a handle for the given position to reshape the `node` using the given `reshapeHandler`.
 * @param [node] The node to reshape with this handle.
 * @param [reshapeHandler] The reshapeable to write the changes to.
 * @param [position] The position of the handle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeReshapeHandlerHandle%23NodeReshapeHandlerHandle-constructor-NodeReshapeHandlerHandle">Online Documentation</a>
 * 
 * @property node
 * Gets the node to reshape with this handle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeReshapeHandlerHandle%23node">Online Documentation</a>
 */
external open class NodeReshapeHandlerHandle  (
final val node: INode,
 reshapeHandler: IReshapeHandler ,
 position: HandlePositions ) : ReshapeHandlerHandle {

/**
 * Gets or sets the maximum size allowed for the reshapeable.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeReshapeHandlerHandle%23maximumSize">Online Documentation</a>
 */
override var maximumSize: ISize
/**
 * Gets or sets the minimum enclosed area that needs to be encompassed by this reshapeable.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeReshapeHandlerHandle%23minimumEnclosedArea">Online Documentation</a>
 */
override var minimumEnclosedArea: IRectangle
/**
 * Gets or sets the minimum size allowed for the reshapeable.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeReshapeHandlerHandle%23minimumSize">Online Documentation</a>
 */
override var minimumSize: ISize
/**
 * Gets or sets an [INodeSizeConstraintProvider] that is queried in [minimumSize], [maximumSize] and [minimumEnclosedArea] if no explicit value was set.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeReshapeHandlerHandle%23sizeConstraintProvider">Online Documentation</a>
 */
final var sizeConstraintProvider: INodeSizeConstraintProvider?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeReshapeHandlerHandle%23NodeReshapeHandlerHandle-method-cancelDrag">Online Documentation</a>
 */
 override   fun cancelDrag( context: IInputModeContext ,
 originalLocation: Point )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeReshapeHandlerHandle%23NodeReshapeHandlerHandle-method-dragFinished">Online Documentation</a>
 */
 override   fun dragFinished( context: IInputModeContext ,
 originalLocation: Point ,
 newLocation: Point )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeReshapeHandlerHandle%23NodeReshapeHandlerHandle-method-handleMove">Online Documentation</a>
 */
 override   fun handleMove( context: IInputModeContext ,
 originalLocation: Point ,
 newLocation: Point )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeReshapeHandlerHandle%23NodeReshapeHandlerHandle-method-initializeDrag">Online Documentation</a>
 */
 override   fun initializeDrag( context: IInputModeContext )

companion object : ClassMetadata<NodeReshapeHandlerHandle> {
}
}
