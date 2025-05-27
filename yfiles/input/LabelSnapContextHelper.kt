// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.IOrientedRectangle
import yfiles.graph.ILabel
import yfiles.lang.ClassMetadata

/**
 * The default label snap context helper that provides the snap lines and the snap results to the [LabelSnapContext] during dragging of labels.
 * @see [LabelSnapContext]
 * @see [LabelDecorator.labelSnapContextHelperDecorator][yfiles.graph.LabelDecorator.labelSnapContextHelperDecorator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelSnapContextHelper">Online Documentation</a>
 */
external open class LabelSnapContextHelper 
protected constructor () : ILabelSnapContextHelper {

/**
 * Adds snap lines to the `snapContext` that are parallel to the path segments of the owner edge at particular distances.
 * @param [snapContext] The snap context which manages the snap lines and the settings. Note that implementations should not change the state of the context explicitly.
 * @param [inputModeContext] The context of the input mode that handles the dragging.
 * @param [label] The edge label that is dragged.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelSnapContextHelper%23LabelSnapContextHelper-method-addEdgePathSnapLines(LabelSnapContext,IInputModeContext,ILabel)">Online Documentation</a>
 */
 open protected   fun addEdgePathSnapLines( snapContext: LabelSnapContext ,
 inputModeContext: IInputModeContext ,
 label: ILabel )
/**
 * Adds snap lines to the `snapContext` that are parallel to the path segments of the owner edge at the given distance.
 * @param [snapContext] The snap context which manages the snap lines and the settings. Note that implementations should not change the state of the context explicitly.
 * @param [inputModeContext] The context of the input mode that handles the dragging.
 * @param [label] The edge label that is dragged.
 * @param [distance] The distance of the added snap lines from the edge path.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelSnapContextHelper%23LabelSnapContextHelper-method-addEdgePathSnapLines(LabelSnapContext,IInputModeContext,ILabel,number)">Online Documentation</a>
 */
 open protected   fun addEdgePathSnapLines( snapContext: LabelSnapContext ,
 inputModeContext: IInputModeContext ,
 label: ILabel ,
 distance: Double )
/**
 * Adds two snap line for the initial center location of the label, one in the direction of the up vector, the other orthogonal to that direction.
 * @param [snapContext] The snap context which manages the snap lines and the settings. Note that implementations should not change the state of the context explicitly.
 * @param [inputModeContext] The context of the input mode that handles the dragging.
 * @param [label] The label that is dragged.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelSnapContextHelper%23LabelSnapContextHelper-method-addInitialLocationSnapLines">Online Documentation</a>
 */
 open protected   fun addInitialLocationSnapLines( snapContext: LabelSnapContext ,
 inputModeContext: IInputModeContext ,
 label: ILabel )
/**
 * Adds snap lines to the `snapContext` that are parallel to the owner node's border at particular distances.
 * @param [snapContext] The snap context which manages the snap lines and the settings. Note that implementations should not change the state of the context explicitly.
 * @param [inputModeContext] The context of the input mode that handles the dragging.
 * @param [label] The node label that is dragged.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelSnapContextHelper%23LabelSnapContextHelper-method-addNodeShapeSnapLines">Online Documentation</a>
 */
 open protected   fun addNodeShapeSnapLines( snapContext: LabelSnapContext ,
 inputModeContext: IInputModeContext ,
 label: ILabel )
/**
 * Adds horizontal and vertical snap lines to the `snapContext` that are originating from the label's owner port if the label's owner is a port.
 * @param [snapContext] The snap context which manages the snap lines and the settings. Note that implementations should not change the state of the context explicitly.
 * @param [inputModeContext] The context of the input mode that handles the dragging.
 * @param [label] The port label that is dragged.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelSnapContextHelper%23LabelSnapContextHelper-method-addPortSnapLines">Online Documentation</a>
 */
 open protected   fun addPortSnapLines( snapContext: LabelSnapContext ,
 inputModeContext: IInputModeContext ,
 label: ILabel )
/**
 * Called during [initialization][IDragHandler.initializeDrag] of a `label` dragging to add [snap lines][SnapLine] to which the label can potentially snap to the `snapContext`.
 * @param [snapContext] The snap context which manages the snap lines and the settings. Note that implementations should not change the state of the context explicitly.
 * @param [inputModeContext] The context of the input mode that handles the dragging.
 * @param [label] The label that is dragged.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelSnapContextHelper%23LabelSnapContextHelper-method-addSnapLines">Online Documentation</a>
 */
 override   fun addSnapLines( snapContext: LabelSnapContext ,
 inputModeContext: IInputModeContext ,
 label: ILabel )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelSnapContextHelper%23LabelSnapContextHelper-method-collectSnapResults">Online Documentation</a>
 */
 override   fun collectSnapResults( context: LabelSnapContext ,
 event: CollectSnapResultsEventArgs ,
 suggestedLayout: IOrientedRectangle ,
 label: ILabel )

companion object : ClassMetadata<LabelSnapContextHelper> {
/**
 * Returns the static shared instance of this class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelSnapContextHelper%23INSTANCE">Online Documentation</a>
 */
 val INSTANCE: LabelSnapContextHelper
}
}
