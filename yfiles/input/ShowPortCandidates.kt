// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.lang.YFlags

/**
 * Defines whether to show the visualization of start and end port candidates during [interactive edge creation][CreateEdgeInputMode].
 * @see [CreateEdgeInputMode.showPortCandidates]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShowPortCandidates">Online Documentation</a>
 */

external class ShowPortCandidates private constructor(): YFlags<ShowPortCandidates> {
  companion object {
    /**
     * Don't show any port candidates.
     * 
     * Value - `0`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShowPortCandidates%23NONE">Online Documentation</a>
     */
    val NONE: ShowPortCandidates
    
    /**
     * Show port candidates to start the edge creation at.
     * 
     * Value - `1`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShowPortCandidates%23START">Online Documentation</a>
     */
    val START: ShowPortCandidates
    
    /**
     * Show port candidates for possible ends of the newly created edge.
     * 
     * Value - `2`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShowPortCandidates%23END">Online Documentation</a>
     */
    val END: ShowPortCandidates
    
    /**
     * Show port candidates for both the start and the end of the newly created edge.
     * 
     * Value - `3`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShowPortCandidates%23ALL">Online Documentation</a>
     */
    val ALL: ShowPortCandidates
  }
}
