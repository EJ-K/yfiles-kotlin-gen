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
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * Provides the snap lines and the snap results to the [LabelSnapContext] during dragging of labels.
 * @see [LabelSnapContext]
 * @see [LabelDecorator.labelSnapContextHelperDecorator][yfiles.graph.LabelDecorator.labelSnapContextHelperDecorator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelSnapContextHelper">Online Documentation</a>
 */
external interface ILabelSnapContextHelper : YObject {
/**
 * Called during [initialization][IDragHandler.initializeDrag] of a `label` dragging to add [snap lines][SnapLine] to which the label can potentially snap to the `snapContext`.
 * @param [snapContext] The snap context which manages the snap lines and the settings. Note that implementations should not change the state of the context explicitly.
 * @param [inputModeContext] The context of the input mode that handles the dragging.
 * @param [label] The label that is dragged.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelSnapContextHelper%23ILabelSnapContextHelper-method-addSnapLines">Online Documentation</a>
 */
   fun addSnapLines( snapContext: LabelSnapContext ,
 inputModeContext: IInputModeContext ,
 label: ILabel )
/**
 * Called while the given `label` is [dragged][IDragHandler.handleMove] to add [snap results][SnapResult] for the [snap lines][SnapLine] provided by the `context`.
 * @param [context] The snap context which manages the snap lines and the settings.
 * @param [event] The event argument to obtain the necessary information from and [add results to][CollectSnapResultsEventArgs.addSnapResult].
 * @param [suggestedLayout] The [layout][ILabel.layout] of the label that would be used without snapping.
 * @param [label] The label that is dragged.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelSnapContextHelper%23ILabelSnapContextHelper-method-collectSnapResults">Online Documentation</a>
 */
   fun collectSnapResults( context: LabelSnapContext ,
 event: CollectSnapResultsEventArgs ,
 suggestedLayout: IOrientedRectangle ,
 label: ILabel )

companion object : InterfaceMetadata<ILabelSnapContextHelper> {
}
}
