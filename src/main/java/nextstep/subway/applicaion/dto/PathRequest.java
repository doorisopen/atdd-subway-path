package nextstep.subway.applicaion.dto;

public class PathRequest {
    private Long source;
    private Long target;

    public PathRequest(Long source, Long target) {
        this.source = source;
        this.target = target;
    }

    public boolean isSame() {
        return source.equals(target);
    }

    public Long getSource() {
        return source;
    }

    public Long getTarget() {
        return target;
    }
}
