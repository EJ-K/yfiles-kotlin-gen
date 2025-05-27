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
import yfiles.graph.INode
import yfiles.lang.ClassMetadata

/**
 * Default implementation of the [IReshapeHandleProvider] interface for nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeReshapeHandleProvider">Online Documentation</a>
 * 
 * @constructor Creates a default instance that provide handles for each of the `handlePositions` given for the `node`.
 * @param [node] The node to provide reshape handles for.
 * @param [reshapeHandler] The reshape handler to delegate the actual reshaping to.
 * @param [handlePositions] A bitwise combination of all handle positions this instance should provide a handle for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeReshapeHandleProvider%23NodeReshapeHandleProvider-constructor-NodeReshapeHandleProvider">Online Documentation</a>
 * 
 * @property node
 * Gets the node to provide reshape handles for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeReshapeHandleProvider%23node">Online Documentation</a>
 * 
 * @property reshapeHandler
 * Gets the reshape handler to delegate the actual reshaping to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeReshapeHandleProvider%23reshapeHandler">Online Documentation</a>
 */
external open class NodeReshapeHandleProvider  (
final val node: INode,
final val reshapeHandler: IReshapeHandler,
 handlePositions: HandlePositions ) : ReshapeHandleProviderBase {

/**
 * Gets or sets the event recognizer that determines if the center of the reshapeable is kept during the reshape gesture.
 * 
 * The default value is [KeyEventRecognizers.ALT_IS_DOWN].
 * @see [ratioReshapeRecognizer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeReshapeHandleProvider%23centerReshapeRecognizer">Online Documentation</a>
 */
final var centerReshapeRecognizer: EventRecognizer
/**
 * Gets or sets the maximum size allowed for the reshapeable.
 * 
 * The default value is [Size.INFINITE][yfiles.geometry.Size.INFINITE].
 * @see [RectangleHandle.maximumSize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeReshapeHandleProvider%23maximumSize">Online Documentation</a>
 */
override var maximumSize: ISize
/**
 * Gets or sets the minimum rectangular area that needs to be contained in the reshapeable.
 * 
 * The default value is [Rect.EMPTY][yfiles.geometry.Rect.EMPTY].
 * @see [RectangleHandle.minimumEnclosedArea]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeReshapeHandleProvider%23minimumEnclosedArea">Online Documentation</a>
 */
override var minimumEnclosedArea: IRectangle
/**
 * Gets or sets the minimum size allowed for the reshapeable.
 * 
 * The default value is [Size.ZERO][yfiles.geometry.Size.ZERO].
 * @see [RectangleHandle.minimumSize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeReshapeHandleProvider%23minimumSize">Online Documentation</a>
 */
override var minimumSize: ISize
/**
 * Gets or sets the event recognizer that determines if the width/height ratio of the reshapeable is kept during the reshape gesture.
 * 
 * The default value is [KeyEventRecognizers.SHIFT_IS_DOWN].
 * @see [centerReshapeRecognizer]
 * @see [reshapePolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeReshapeHandleProvider%23ratioReshapeRecognizer">Online Documentation</a>
 */
final var ratioReshapeRecognizer: EventRecognizer
/**
 * Gets or sets the policy that determines how the mouse location is interpreted when the reshape gesture shall keep the aspect ratio.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeReshapeHandleProvider%23reshapePolicy">Online Documentation</a>
 */
final var reshapePolicy: ReshapePolicy
/**
 * Gets or sets an [INodeSizeConstraintProvider] that is passed to the [queried][getHandle] handles.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeReshapeHandleProvider%23sizeConstraintProvider">Online Documentation</a>
 */
final var sizeConstraintProvider: INodeSizeConstraintProvider?
/**
 * Provides a [NodeReshapeHandlerHandle] that uses the [reshapeHandler] to perform the actual reshaping.
 * @param [context] The context for which the handles are queried.
 * @param [position] The position to provide an instance for.
 * @return A handle implementation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeReshapeHandleProvider%23NodeReshapeHandleProvider-method-getHandle">Online Documentation</a>
 */
 override   fun getHandle( context: IInputModeContext ,
 position: HandlePositions ):IHandle

companion object : ClassMetadata<NodeReshapeHandleProvider> {
}
}
