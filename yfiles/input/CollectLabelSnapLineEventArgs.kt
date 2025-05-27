// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.collections.ICollection
import yfiles.lang.ClassMetadata

/**
 * The event arguments used by [LabelSnapContext] to collect custom snap lines for each drag.
 * @see [LabelSnapContext.addCollectSnapLinesListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollectLabelSnapLineEventArgs">Online Documentation</a>
 * 
 * @constructor Creates a new instance of this class.
 * @param [context] The context this event is being used in.
 * @param [snapLines] The snap lines collection to add to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollectLabelSnapLineEventArgs%23CollectLabelSnapLineEventArgs-constructor-CollectLabelSnapLineEventArgs">Online Documentation</a>
 */
external open class CollectLabelSnapLineEventArgs  ( context: IInputModeContext ,
 snapLines: ICollection<out SnapLine> ) : InputModeEventArgs {

/**
 * Adds the given snap line to the snap line collection of this class.
 * @param [snapLine] the snap line to add.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollectLabelSnapLineEventArgs%23CollectLabelSnapLineEventArgs-method-addSnapLine">Online Documentation</a>
 */
 final   fun addSnapLine( snapLine: OrthogonalSnapLine )

companion object : ClassMetadata<CollectLabelSnapLineEventArgs> {
}
}
