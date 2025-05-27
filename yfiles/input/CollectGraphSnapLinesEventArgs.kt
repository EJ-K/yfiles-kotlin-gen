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
 * Event arguments for the [GraphSnapContext.CollectSnapLines] event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollectGraphSnapLinesEventArgs">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [CollectGraphSnapLinesEventArgs] class.
 * @param [context] The context where the event is being used in.
 * @param [fixedNodeSnapLines] The fixed node snap lines collection to add to.
 * @param [fixedSegmentSnapLines] The fixed segment snap lines collection to add to.
 * @param [fixedPortSnapLines] The fixed port snap lines collection to add to.
 * @param [additionalSnapLines] The additional snap lines collection to add to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollectGraphSnapLinesEventArgs%23CollectGraphSnapLinesEventArgs-constructor-CollectGraphSnapLinesEventArgs">Online Documentation</a>
 */
external open class CollectGraphSnapLinesEventArgs  ( context: IInputModeContext ,
 fixedNodeSnapLines: ICollection<out OrthogonalSnapLine> ,
 fixedSegmentSnapLines: ICollection<out OrthogonalSnapLine> ,
 fixedPortSnapLines: ICollection<out OrthogonalSnapLine> ,
 additionalSnapLines: ICollection<out OrthogonalSnapLine> ) : InputModeEventArgs {

/**
 * Adds a snap line all elements will snap to.
 * @param [snapLine] The snap line to add to the list of lines that all elements snap to by default.
 * @see [GraphSnapContext.additionalSnapLines]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollectGraphSnapLinesEventArgs%23CollectGraphSnapLinesEventArgs-method-addAdditionalSnapLine">Online Documentation</a>
 */
 final   fun addAdditionalSnapLine( snapLine: OrthogonalSnapLine )
/**
 * Adds a snap line for nodes.
 * @param [snapLine] The snap line to add to the list of lines that nodes snap to by default.
 * @see [GraphSnapContext.fixedNodeSnapLines]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollectGraphSnapLinesEventArgs%23CollectGraphSnapLinesEventArgs-method-addFixedNodeSnapLine">Online Documentation</a>
 */
 final   fun addFixedNodeSnapLine( snapLine: OrthogonalSnapLine )
/**
 * Adds a snap line for edge segments and bends.
 * @param [snapLine] The snap line to add to the list of lines that segments snap to by default.
 * @see [GraphSnapContext.fixedSegmentSnapLines]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollectGraphSnapLinesEventArgs%23CollectGraphSnapLinesEventArgs-method-addFixedSegmentSnapLine">Online Documentation</a>
 */
 final   fun addFixedSegmentSnapLine( snapLine: OrthogonalSnapLine )
/**
 * Adds a snap line for ports.
 * @param [snapLine] The snap line to add to the list of lines that ports snap to by default.
 * @see [GraphSnapContext.fixedPortSnapLines]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollectGraphSnapLinesEventArgs%23CollectGraphSnapLinesEventArgs-method-addPortSnapLine">Online Documentation</a>
 */
 final   fun addPortSnapLine( snapLine: OrthogonalSnapLine )

companion object : ClassMetadata<CollectGraphSnapLinesEventArgs> {
}
}
