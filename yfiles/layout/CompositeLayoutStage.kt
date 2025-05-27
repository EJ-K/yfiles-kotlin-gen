// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.collections.IList
import yfiles.lang.ClassMetadata

/**
 * [CompositeLayoutStage] allows for combining multiple [ILayoutStage]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeLayoutStage">Online Documentation</a>
 * 
 * @constructor Creates a new [CompositeLayoutStage] instance with an empty pipeline.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeLayoutStage%23CompositeLayoutStage-constructor-CompositeLayoutStage()">Online Documentation</a>
 */
external open class CompositeLayoutStage  () : LayoutStageBase {
/**
 * Creates a new [CompositeLayoutStage] instance with two [ILayoutStage]s in the pipeline.
 * @param [outerStage] the wrapping [ILayoutStage]
 * @param [innerStage] the wrapped [ILayoutStage]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeLayoutStage%23CompositeLayoutStage-constructor-CompositeLayoutStage(ILayoutStage,ILayoutStage)">Online Documentation</a>
 */
 constructor( outerStage: ILayoutStage ,
 innerStage: ILayoutStage )

/**
 * Gets the complete pipeline of [ILayoutStage]s that were added to this [CompositeLayoutStage].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeLayoutStage%23layoutStages">Online Documentation</a>
 */
open val layoutStages: IList<out ILayoutStage>
/**
 * Appends a [ILayoutStage] to the previously added [ILayoutStage]s.
 * @param [stage] the stage to append
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeLayoutStage%23CompositeLayoutStage-method-appendStage">Online Documentation</a>
 */
 open   fun appendStage( stage: ILayoutStage )
/**
 * Executes the pipeline of [ILayoutStage] and the core layout algorithm which apply the layout to the graph.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeLayoutStage%23CompositeLayoutStage-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )
/**
 * Prepends a [ILayoutStage] to the previously added [ILayoutStage]s.
 * @param [stage] the stage to prepend
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeLayoutStage%23CompositeLayoutStage-method-prependStage">Online Documentation</a>
 */
 open   fun prependStage( stage: ILayoutStage )

companion object : ClassMetadata<CompositeLayoutStage> {
}
}
