// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.Point
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.lang.ClassMetadata
import yfiles.view.IGraphSelection

/**
 * An [IInputMode] that can be used to drag a [ILabel] in a [GraphComponent][yfiles.view.GraphComponent].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveLabelInputMode">Online Documentation</a>
 * 
 * @constructor Creates a new instance that will move labels in the graph retrieved from the [MoveInputMode.inputModeContext].
 * @see [graph]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveLabelInputMode%23MoveLabelInputMode-constructor-MoveLabelInputMode">Online Documentation</a>
 */
external open class MoveLabelInputMode  () : MoveInputMode {

/**
 * Gets or sets a property that determines whether or not moving unselected labels is allowed.
 * 
 * The default value is `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveLabelInputMode%23allowUnselected">Online Documentation</a>
 */
final var allowUnselected: Boolean
/**
 * Gets the [IGraph] this mode is acting upon.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveLabelInputMode%23graph">Online Documentation</a>
 */
final val graph: IGraph?
/**
 * Gets the [IGraphSelection] this mode is acting upon.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveLabelInputMode%23graphSelection">Online Documentation</a>
 */
final val graphSelection: IGraphSelection?
/**
 * Gets the label that is currently moved or `null` if there is no such label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveLabelInputMode%23movedLabel">Online Documentation</a>
 */
final val movedLabel: ILabel?
/**
 * Gets or sets a value indicating whether or not using the [ILabelModelParameterFinder] to assign new label model parameters is allowed.
 * @see [createLabelPositionHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveLabelInputMode%23useLabelModelParameterFinder">Online Documentation</a>
 */
final var useLabelModelParameterFinder: Boolean
/**
 * Gets or sets how the moved label should be shown during the gesture.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveLabelInputMode%23visualization">Online Documentation</a>
 */
final var visualization: Visualization
/**
 * Creates the [position handler][IPositionHandler] for the given label used in [isValidLabelHit].
 * @param [label] The label to create a position handler for.
 * @return A position handler for the given label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveLabelInputMode%23MoveLabelInputMode-method-createLabelPositionHandler">Online Documentation</a>
 */
 open protected   fun createLabelPositionHandler( label: ILabel ):IPositionHandler
/**
 * Looks for a label that has been hit at the specified position.
 * @param [context] The context for the hit test.
 * @param [location] The coordinates for the hit test.
 * @return The label hit at the given location or `null`.
 * @see [isValidLabelHit]
 * @see [shouldMove]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveLabelInputMode%23MoveLabelInputMode-method-getHitLabel">Online Documentation</a>
 */
 open protected   fun getHitLabel( context: IInputModeContext ,
 location: Point ):ILabel?
/**
 * Determines whether or not a valid label has been hit at the specified position.
 * @param [context] The context for the hit test.
 * @param [location] The coordinates for the hit test.
 * @return `true` if a valid label is hit and the label moving should be started here. Otherwise, `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveLabelInputMode%23MoveLabelInputMode-method-isValidLabelHit">Online Documentation</a>
 */
 open protected   fun isValidLabelHit( context: IInputModeContext ,
 location: Point ):Boolean
/**
 * Clears the [MoveInputMode.positionHandler] property.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveLabelInputMode%23MoveLabelInputMode-method-onDragCanceled">Online Documentation</a>
 */
 override   fun onDragCanceled( event: InputModeEventArgs )
/**
 * Clears the [MoveInputMode.positionHandler] property.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveLabelInputMode%23MoveLabelInputMode-method-onDragFinished">Online Documentation</a>
 */
 override   fun onDragFinished( event: InputModeEventArgs )
/**
 * Registers the [MoveInputMode.positionHandler] created during the last [createLabelPositionHandler] call.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveLabelInputMode%23MoveLabelInputMode-method-onDragStarting">Online Documentation</a>
 */
 override   fun onDragStarting( event: InputModeEventArgs )
/**
 * Determines whether or not a label is allowed to be moved.
 * @param [context] The context.
 * @param [label] The label to be checked.
 * @return `true` if the label is allowed to move.
 * @see [getHitLabel]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveLabelInputMode%23MoveLabelInputMode-method-shouldMove">Online Documentation</a>
 */
 open protected   fun shouldMove( context: IInputModeContext ,
 label: ILabel ):Boolean

companion object : ClassMetadata<MoveLabelInputMode> {
}
}

inline fun MoveLabelInputMode(
    block: MoveLabelInputMode.() -> Unit
): MoveLabelInputMode {
    return MoveLabelInputMode()
        .apply(block)
}
